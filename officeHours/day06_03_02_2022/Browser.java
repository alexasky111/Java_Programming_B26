package day06_03_02_2022;

public class Browser {
    public static void main(String[] args) {

        String browserName = "safari";
        String operatingSystem = "mac";
        boolean isBrowserOpened = true;

        if (!isBrowserOpened) {
            //I will open the browser
            switch (browserName) {
                case "chrome":
                case "chrome-headless":
                case "firefox":
                case "remote-chrome":
                    System.out.println("Browser is opened successfully with " + browserName + " in " + operatingSystem);
                    break;

                case "ie":
                case "edge":
                    if(operatingSystem.equals("windows")) {
                        System.out.println("Browser is opened successfully with " + browserName + " in " + operatingSystem);}
                    else {
                        System.out.println("Your "+operatingSystem+" doesn't support"+browserName);
                    }
                    break;
            }


            } else{
                System.out.println("Browser is already opened w/" + browserName + " in " + operatingSystem);
            }


        }
    }
