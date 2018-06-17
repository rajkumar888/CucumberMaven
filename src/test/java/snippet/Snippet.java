package snippet;

public class Snippet {
	public static void main(String[] args) {
		<properties>
				<SuiteXmlFile>testng.xml</SuiteXmlFile>
				<my.plugin.version>1.5</my.plugin.version>
				<testNgVersion></testNgVersion>
				<SeleniumVersion>3.12.0</SeleniumVersion>
				<junitVersion></junitVersion>
				<propertyName>firefox</propertyName>
				<application-home>/path/to/application</application-home>
			</properties>
		
			<dependencies>
				<!-- https://mvnrepository.com/artifact/org.testng/testng -->
				<dependency>
					<groupId>org.testng</groupId>
					<artifactId>testng</artifactId>
					<version>6.14.3</version>
					<scope>test</scope>
				</dependency>
				<dependency>
					<groupId>org.apache.poi</groupId>
					<artifactId>poi</artifactId>
					<version>3.9</version>
				</dependency>
				<dependency>
					<groupId>org.apache.poi</groupId>
					<artifactId>poi-ooxml</artifactId>
					<version>3.9</version>
				</dependency>
				<dependency>
					<groupId>log4j</groupId>
					<artifactId>log4j</artifactId>
					<version>1.2.17</version>
				</dependency>
				<dependency>
					<groupId>org.apache.logging.log4j</groupId>
					<artifactId>log4j-api</artifactId>
					<version>2.6.2</version>
				</dependency>
				<dependency>
					<groupId>org.apache.logging.log4j</groupId>
					<artifactId>log4j-core</artifactId>
					<version>2.6.2</version>
				</dependency>
				<dependency>
					<groupId>xml-apis</groupId>
					<artifactId>xml-apis</artifactId>
					<version>1.4.01</version>
				</dependency>
				<!-- https://mvnrepository.com/artifact/junit/junit -->
				<dependency>
					<groupId>junit</groupId>
					<artifactId>junit</artifactId>
					<version>4.11</version>
					<scope>test</scope>
				</dependency>
				<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
				<dependency>
					<groupId>io.cucumber</groupId>
					<artifactId>cucumber-java</artifactId>
					<version>3.0.2</version>
				</dependency>
				<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java8 -->
				<dependency>
					<groupId>io.cucumber</groupId>
					<artifactId>cucumber-java8</artifactId>
					<version>3.0.2</version>
				</dependency>
				<dependency>
					<groupId>io.cucumber</groupId>
					<artifactId>cucumber-testng</artifactId>
					<version>3.0.2</version>
				</dependency>
				<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
				<dependency>
					<groupId>io.cucumber</groupId>
					<artifactId>cucumber-junit</artifactId>
					<version>3.0.2</version>
					<scope>test</scope>
				</dependency>
				<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-core -->
				<dependency>
					<groupId>io.cucumber</groupId>
					<artifactId>cucumber-core</artifactId>
					<version>3.0.2</version>
				</dependency>
				<!-- https://mvnrepository.com/artifact/io.cucumber/gherkin -->
				<dependency>
					<groupId>io.cucumber</groupId>
					<artifactId>gherkin</artifactId>
					<version>5.1.0</version>
				</dependency>
				<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
				<dependency>
					<groupId>org.seleniumhq.selenium</groupId>
					<artifactId>selenium-java</artifactId>
					<version>${SeleniumVersion}</version>
				</dependency>
				<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
				<dependency>
					<groupId>com.aventstack</groupId>
					<artifactId>extentreports</artifactId>
					<version>3.0.1</version>
				</dependency>
				<dependency>
					<groupId>mysql</groupId>
					<artifactId>mysql-connector-java</artifactId>
					<version>6.0.5</version>
				</dependency>
			</dependencies>
			<build>
				<plugins>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-compiler-plugin</artifactId>
						<version>3.7.0</version>
						<configuration>
							<compilerVersion>1.8</compilerVersion>
							<source>1.8</source>
							<target>1.8</target>
						</configuration>
					</plugin>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-surefire-plugin</artifactId>
						<version>2.22.0</version>
						<configuration>
							<SuiteXmlFiles>
								<suiteXmlFile>${suiteXmlFile}</suiteXmlFile>
							</SuiteXmlFiles>
							<!-- <systemPropertyVariables> -->
							<!-- <propertyName>firefox</propertyName> -->
							<!-- <userName>${DuserName}</userName> -->
							<!-- <password>${Dpassword}</password> -->
							<!-- <implicitWait>${DimplicitWait}</implicitWait> -->
							<!-- <explicitWait>${DexplicitWait}</explicitWait> -->
							<!-- </systemPropertyVariables> -->
							<!-- <groups>com.mycompany.SlowTests</groups> -->
							<!-- <url>${url}</url> -->
							<!-- <username>${username}</username> -->
							<!-- <environment>${environment}</environment> -->
						</configuration>
					</plugin>
				</plugins>
			</build>
	}
}

