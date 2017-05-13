package readings;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebsiteParser {

	public static void main(String[] args) throws IOException {

		Document doc;

		try {
			doc = Jsoup.connect("https://www.horoscope.com/us/index.aspx").userAgent("Mozilla/17.0").get();
			Elements ele = doc.select("div.sign");

			int i = 0;
			for (Element horoscopes : ele) {

				i++;
				System.out.println(i + " "
						+ horoscopes.text());
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
