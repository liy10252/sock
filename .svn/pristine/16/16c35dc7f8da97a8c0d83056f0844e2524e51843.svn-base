package cases.leakscan.overview;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.overview.OverViewPage;
import util.SeleniumTestCase;

public class RankTest extends SeleniumTestCase {

	OverViewPage overViewPage;

	@Test(description = "无严重等级")
	public void noRank(){

		overViewPage = new OverViewPage(driver);
		overViewPage.getCustomSearch().click();
		overViewPage.singleClick(overViewPage.getRankAll(),overViewPage.getNoRank());
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("noRank"),"无严重等级错误");
	}

	@Test(dependsOnMethods = "noRank",description = "低等")
	public void lowRank(){

		overViewPage.singleClick(overViewPage.getRankAll(),overViewPage.getLowRank());
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("lowRank"),"低等错误");
	}

	@Test(dependsOnMethods = "noRank",description = "中等")
	public void midRank(){

		overViewPage.singleClick(overViewPage.getRankAll(),overViewPage.getMidRank());
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("midRank"),"中等错误");
	}

	@Test(dependsOnMethods = "noRank",description = "重要")
	public void importantRank(){

		overViewPage.singleClick(overViewPage.getRankAll(),overViewPage.getImportantRank());
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("importantRank"),"重要错误");
	}

	@Test(dependsOnMethods = "noRank",description = "严重")
	public void seriousRank(){

		overViewPage.singleClick(overViewPage.getRankAll(),overViewPage.getSeriousRank());
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("seriousRank"),"严重错误");
	}
}
