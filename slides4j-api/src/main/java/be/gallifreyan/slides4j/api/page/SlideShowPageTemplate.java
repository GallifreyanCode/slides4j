package be.gallifreyan.slides4j.api.page;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import be.gallifreyan.slides4j.api.creator.SlideShowCreatorTemplate;
import be.gallifreyan.slides4j.api.slideshow.SlideShowTemplate;

public abstract class SlideShowPageTemplate<T extends SlideShowTemplate>
		extends HttpServlet implements SlideShowPage<T> {
	private static final long serialVersionUID = -5654592392140368901L;
	public final static Logger logger = LoggerFactory
			.getLogger(SlideShowPageTemplate.class);

	public void init(ServletConfig config) throws ServletException {
		logger.info("init(ServletConfig config)");
		super.init(config);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.info("doGet(HttpServletRequest request, HttpServletResponse response)");
		createSlideShowResponse(request, response, "GET");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		logger.info("doPost(HttpServletRequest request, HttpServletResponse response)");
		createSlideShowResponse(request, response, "POST");
	}

	public void createSlideShowResponse(HttpServletRequest request,
			HttpServletResponse response, String methodGetPost) {
		logger.info("reateSlideShowResponse(HttpServletRequest request, HttpServletResponse response, String methodGetPost");
		try {
			SlideShowCreatorTemplate<T> slideShowCreator = new SlideShowCreatorTemplate<T>();
			logger.debug(slideShowCreator.toString());
			ByteArrayOutputStream outputStream = slideShowCreator
					.createFromTemplate(getSlideShowType());
			logger.debug(outputStream.toString());
			response = createResponse(response, outputStream.size());
			ServletOutputStream out = response.getOutputStream();
			outputStream.writeTo(out);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private HttpServletResponse createResponse(HttpServletResponse response,
			int size) {
		logger.info("createResponse(HttpServletResponse response, int size)");
		response.setHeader("Expires", "0");
		response.setHeader("Cache-Control",
				"must-revalidate, post-check=0, pre-check=0");
		response.setHeader("Pragma", "public");
		response.setContentType("text/html");
		response.setContentLength(size);
		return response;
	}
}
