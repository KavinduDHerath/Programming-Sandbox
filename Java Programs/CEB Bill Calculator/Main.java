import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Date date = new Date();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                              🟥🟧🟨🟩🟦🟪⚡⚡⚡⚡Ceylon Electricity Board 🔰🔰 Consumer Electricity Bill Calculator⚡⚡⚡⚡🟪🟦🟩🟨🟧🟥                ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                ⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩");
        System.out.println("                ⏬                                                                                                                                                           ⏬");
        System.out.println("                ⏬                                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                                 ⏬");
        System.out.println("                ⏬                                   🔷🔋🔋🔋🔋````````````🔋🔋🔋🔋``Electricity Consumer Categories``🔋🔋🔋🔋````````````🔋🔋🔋🔋🔷                                 ⏬");
        System.out.println("                ⏬                                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                                 ⏬");
        System.out.println("                ⏬                                                                                                                                                           ⏬");
        System.out.println("                ⏬                                                                                                                                                           ⏬");
        System.out.println("                ⏬                  1️⃣) Domestic Category 🏡                                                                                                                 ⏬");
        System.out.println("                ⏫                                                                                                                                                           ⏫");
        System.out.println("                ⏫                  2️⃣) Religious & Charitable Institutions Category 💹                                                                                      ⏫");
        System.out.println("                ⏫                                                                                                                                                           ⏫");
        System.out.println("                ⏫                  3️⃣) Industrial Category 🏭                                                                                                               ⏫");
        System.out.println("                ⏫                                                                                                                                                           ⏫");
        System.out.println("                ⏫                  4️⃣) Hotels & Resorts 🏩                                                                                                                  ⏫");
        System.out.println("                ⏫                                                                                                                                                           ⏫");
        System.out.println("                ⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏪⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩⏩");
        System.out.println();
        System.out.println();

        System.out.println("          💠Use the Above Indexed Consumer Directory to Choose Your Consumer Type🙌");
        System.out.println();
        System.out.print("                  🛑 What is Your Consumer Type️ 👱‍♂️: ");
        int type = input.nextInt();
        System.out.println();

        switch (type) {
            case 1:
                System.out.print("                  🌊 Enter Your Monthly Electricity Consumption 🧮: ");
                int consumption = input.nextInt();
                System.out.println();
                System.out.println();

                if (consumption <= 30) {
                    double bill = ((consumption * 6.00) + 100.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else if (consumption <= 60) {
                    double bill = ((30 * 6.00) + ((consumption - 30) * 9.00) + 250.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else if (consumption <= 90) {
                    double bill = ((60 * 15.00) + ((consumption - 60) * 18.00) + 400.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else if (consumption <= 120) {
                    double bill = ((60 * 15.00) + (30 * 18.00) + ((consumption - 90) * 30.00) + 1000.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else if (consumption <= 180) {
                    double bill = ((60 * 15.00) + (30 * 18.00) + (30 * 30.00) + ((consumption - 120) * 42.00) + 1500.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else {
                    double bill = ((60 * 15.00) + (30 * 18.00) + (30 * 30.00) + (60 * 42.00) + ((consumption - 180) * 65.00) + 2000.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is  LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }
                break;

            case 2:
                System.out.print("                🌊 Enter Your Monthly Electricity Consumption 🧮: ");
                consumption = input.nextInt();
                System.out.println();
                System.out.println();

                if (consumption <= 30) {
                    double bill = ((consumption * 6.00) + 100.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Value Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else if (consumption <= 90) {
                    double bill = ((consumption * 6.00) + 250.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Value Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else if (consumption <= 120) {
                    double bill = ((90 * 6.00) + ((consumption - 90) * 10.00) + 300.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Value Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else if (consumption <= 180) {
                    double bill = ((90 * 6.00) + (30 * 10.00) + ((consumption - 120) * 20.00) + 1200.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Value Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else {
                    double bill = ((90 * 6.00) + (30 * 10.00) + (60 * 20.00) + ((consumption - 180) * 30.00) + 1600.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Value Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }
                break;

            case 3:
                System.out.print("                🌊 Enter Your Monthly Electricity Consumption 🧮: ");
                consumption = input.nextInt();
                System.out.println();
                System.out.println();

                if (consumption <= 300) {
                    double bill = ((consumption * 10.00) + 300.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Value Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else {
                    double bill = ((300 * 10.00) + ((consumption - 300) * 16.00) + 1000.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Value Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }
                break;

            case 4:
                System.out.print("                🌊 Enter Your Monthly Electricity Consumption 🧮: ");
                consumption = input.nextInt();
                System.out.println();
                System.out.println();

                if (consumption <= 300) {
                    double bill = ((consumption * 10.00) + 300.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Value Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }

                else {
                    double bill = ((300 * 10.00) + ((consumption - 300) * 16.00) + 1000.00);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date);
                    int month = cal.get(Calendar.MONTH);
                    System.out.println("                                    ✅ Your Electricity Bill Value for " + month + " is LKR " + bill + " 🕚📊");
                    System.out.println();
                    System.out.println("                                    🔲 Please Pay Your Bill Value Within a Month of the Bill Issued. ⚠📆");
                    System.out.println();
                    System.out.println("                                    🔆 Thanks for Using the Service! ☺🤝");
                    System.out.println();
                    System.out.println("                                    💚 Have a Nice Day! 👲✨");
                    System.out.println();
                }
                break;

            default :
                System.out.println("Please Select the Correct Consumer Type from the above Indexed Directory 🔠🍳💬🔝");

        }

    }
}