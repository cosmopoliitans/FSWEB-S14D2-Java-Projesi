package workintech.s14d2.model.enums;

public enum PaintColor {
    YELLOW("#FFFF00"),
    GREEN("#008000"),
    RED("#FF0000"),
    BLACK("#000000");

    private String colorCode;

    PaintColor(String colorCode){
        this.colorCode = colorCode;
    }
}
