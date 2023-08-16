package com.encapsulation;

public class LoginDemo {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().setSize(new Dimension(1058, 812));
		driver.findElement(By.name("username")).sendKeys("corejava");
		driver.findElement(By.name("password")).sendKeys("exception");
		driver.findElement(By.cssSelector(".oxd-button")).click();
	}
}
