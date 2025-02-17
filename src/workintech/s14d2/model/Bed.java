package workintech.s14d2.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("The bed is being made");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n**********************\n");
        builder.append("Style: " + style + "\n");
        builder.append("Height: " + height + "\n");
        builder.append("Pillows: " + pillows + "\n");
        builder.append("Quilts: " + quilt + "\n");
        builder.append("Sheets: " + sheets + "\n");
        builder.append("**********************\n");
        return builder.toString();
    }
}
