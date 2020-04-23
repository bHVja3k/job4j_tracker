package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
        public static void main(String[] args) {
            JSONReport report = new JSONReport();
            String text = report.generate("name", "body");
            System.out.println(text);
        }

}
