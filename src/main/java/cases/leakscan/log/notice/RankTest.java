package cases.leakscan.log.notice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.log.notice.NoticePage;
import util.SeleniumTestCase;

public class RankTest extends SeleniumTestCase {

	NoticePage noticePage;

	@Test(description = "无严重等级")
	public void noRank(){

		noticePage = new NoticePage(driver);
		noticePage.getCustomSearch().click();
		noticePage.singleClick(noticePage.getRankAll(),noticePage.getNoRank());
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("noRank"),"无严重等级错误");
	}

	@Test(dependsOnMethods = "noRank",description = "低等")
	public void lowRank(){

		noticePage.singleClick(noticePage.getRankAll(),noticePage.getLowRank());
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("lowRank"),"低等错误");
	}

	@Test(dependsOnMethods = "noRank",description = "中等")
	public void midRank(){

		noticePage.singleClick(noticePage.getRankAll(),noticePage.getMidRank());
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("midRank"),"中等错误");
	}

	@Test(dependsOnMethods = "noRank",description = "重要")
	public void importantRank(){

		noticePage.singleClick(noticePage.getRankAll(),noticePage.getImportantRank());
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("importantRank"),"重要错误");
	}

	@Test(dependsOnMethods = "noRank",description = "严重")
	public void seriousRank(){

		noticePage.singleClick(noticePage.getRankAll(),noticePage.getSeriousRank());
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("seriousRank"),"严重错误");
	}
}