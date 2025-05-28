package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {

        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter Browser name");
        String browser = scanner.next();
        browser = browser.toLowerCase(); // lower(Chrome, CHROME, CHrome) == chrome


        switch (browser)
        {
            case "chrome":
            System.out.println("Open Browser");
            System.out.println("........");
            System.out.println("TC1");
            System.out.println("TC2");
            break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }


    }
}
