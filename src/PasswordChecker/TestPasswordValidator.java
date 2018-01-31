package PasswordChecker;


import org.junit.Test;

 

@SuppressWarnings("static-access")

public class TestPasswordValidator

{

    @Test

    public void testNormalPassword()

    {

        PasswordValidator validator = PasswordValidator.buildValidator(false, false, false, 6, 14);

 

        assertEquals(validator.validatePassword("abctodefgjava"));

        assertEquals(validator.validatePassword("abctodefg"));

        //Sort on length

        assertEquals(validator.validatePassword("abcdef"));

    }

 

    @Test

    public void testForceNumeric()

    {

        PasswordValidator validator = PasswordValidator.buildValidator(false,false, true, 6, 16);

        //Contains numeric

        assertEquals(validator.validatePassword("howtodoinjava12"));

        assertEquals(validator.validatePassword("99abctodefgnapa"));

        assertEquals(validator.validatePassword("abctode89innapa"));

        //No numeric

        assertEquals(validator.validatePassword("abctoefghnapa"));

    }

 

    @Test

    public void testForceCapitalLetter()

    {

        PasswordValidator validator = PasswordValidator.buildValidator(false,true, false, 6, 16);

        //Contains capitals

        assertEquals(validator.validatePassword("abctodoinjavA"));

        assertEquals(validator.validatePassword("abctoefghnapa"));

        assertEquals(validator.validatePassword("abctoeFGhnapa"));

        //No capital letter

        assertEquals(validator.validatePassword("abctoefghnapa"));

    }

 

    @Test

    public void testForceSpecialCharacter()

    {

        PasswordValidator validator = PasswordValidator.buildValidator(true,false, false, 6, 16);

        //Contains special char

        assertEquals(validator.validatePassword("pass@inapa"));

        assertEquals(validator.validatePassword("@Suntomondnapa"));

        assertEquals(validator.validatePassword("suntomONdnapa@"));

        //No special char

        assertEquals(validator.validatePassword("suntomondnapa@"));

    }



	private void assertEquals(boolean validatePassword) {
		// TODO Auto-generated method stub
		
	}

}