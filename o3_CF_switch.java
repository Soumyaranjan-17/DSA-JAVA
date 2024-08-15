public class o3_CF_switch {
    public static void main(String[] args) {
        int n = 3;
        String month;

        switch (n) {
            case 1:
                month = "january";
                break;
            case 2:
                month = "february";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "april";
                break;
            case 5:
                month = "may";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December" ;
                break;
            default:
                month = "Invalid Month";
                break;
        }

        System.out.printf("The month name is "+  month + ".\n");
    }
}
