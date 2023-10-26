import org.example.LeapYear;
import org.junit.Test;
import static org.junit.Assert.*;
public class testLeapYear {

    @Test
    public void Test_If_LeapYear_Divisble_By_4_But_Not_By_100() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2020));
        assertTrue(LeapYear.isLeapYear(2400));
    }
    @Test
    public void Test_If_LeapYear_Divisible_By_400() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2400));
    }
    @Test
    public void Test_If_Non_LeapYear() {
        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(2018));

        assertFalse(LeapYear.isLeapYear(2022));


}
