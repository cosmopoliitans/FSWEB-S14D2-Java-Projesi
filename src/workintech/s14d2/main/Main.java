package workintech.s14d2.main;
import workintech.s14d2.model.enums.Direction;
import workintech.s14d2.model.enums.LampType;
import workintech.s14d2.model.enums.PaintColor;
import workintech.s14d2.model.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Elif",
                                new Wall(Direction.NORTH),
                                new Wall(Direction.SOUTH),
                                new Wall(Direction.WEST),
                                new Wall(Direction.EAST),
                                new Ceiling(3, PaintColor.RED),
                                new Lamp(LampType.LAVA, true, 4),
                                new Bed("Çift Kişilik", 5, 2, 2, 2),
                                new Wardrobe(2, 4, 40),
                                new Carpet(3,5, PaintColor.RED));

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println("********************");

        System.out.println(bedroom.getBed());
        System.out.println(bedroom.getLamp());

        //String ler immutable
        String name1 = "Elif";
        String name2 = "Elif";
        String name3 = name1;

        if(name1.equals(name2)){
            System.out.println("Eşit");
        } else{
            System.out.println("Eşit değil");
        }
    }
}