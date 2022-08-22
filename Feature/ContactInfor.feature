Feature: Test to validate the demoguru page features

	Scenario: Test user contact information
		
		Given open the Chrome browser 
		And Enter the URL "https://demo.guru99.com/test/newtours/register.php"
		When valid "Peter" and "Parker" and "9878987678" and "Test@gmail.com"
		And valid "123, main street" and "chennai" and "Tamil Nadu" and "600097" and "India"
		And valid "Spiderman" and "Chan@112523321" and "Chan@112523321"
		Then User should click submit button
		