import java.util.Scanner;
public class Testing {
    public static int test(){
                 /*   Cube myCube;
        myCube.set_Colors_Def();*/

        /* FACE TESTING */
//        Cube_Face test_face = new Cube_Face();
//        test_face.set_Block_Color(0,2,'r');
//        Display_Cube_Face(test_face);
        /* EO FACE TESTING */

        /* CUBE TESTING */
        // NOTE: Game ALWAYS starts with the user selecting the FOCAL(FRONT) face,
        // ...after only decide what color is upper to change perspective.

        // NOTE: FIX --> Cube rubix = new Cube('o', 'r');

        /* PREVIOUS FEATURE TESTING */

//        Cube rubix = new Cube('w', 'o');
//        Display_Cube(rubix);
//        rubix.get_Focal_Face().set_Block_Color(0,2,'r');
//        rubix.get_Focal_Face().rotate_Face_Clock();
//        Display_Cube(rubix);

        /* EO PREV TESTING*/

        /* NEW FEATURE TESTING */
        Cube rubix = new Cube();
        rubix.get_Back_Face().set_Block_Color(0,2,'r');
        rubix.get_Bottom_Face().set_Block_Color(0,2,'r');

//        Display_Cube(rubix);
//        rubix.move_upper_face_clock();
//        Display_Cube(rubix);

        // ROTATE CUBE?
//        Display_Cube(rubix);
//        rubix.rotate_Cube('l', 1);
        Main.Display_Cube(rubix);
        /* EO NEW TESTING */

        /* EO CUBE TESTING */
        return 0;
    }
}