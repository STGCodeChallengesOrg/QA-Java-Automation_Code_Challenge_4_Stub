/*

automation challenge 4 (Get info):
write a method to return the time each ski resort is from the Airport.

Go to https://www.skiutah.com/

click on the link that is on the home page to compare resorts.

The method should be able to return a time based on the name of the ski resort that I want to pass in.  You can return the value either w/ a string or int.

Listed below is the sample code stub for running this test.

*/

public class WebPageTest {

    @Test
    private void TestLauncher() throws InterruptedException {

        // Verify Page Title
        VerifyPageTitle(URL, Expected_Value);
        // Verify Resort Mileage from Airport
        getResortMileageFromAirport(Resort_Name);
    }
}
