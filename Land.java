import greenfoot.*;

/**
 * Write a description of class Land here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Land extends World
{

    /**
     * Constructor for objects of class Land.
     * 
     */
    public Land()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero, 53, 131);
        Monster monster = new Monster();
        addObject(monster, 455, 242);
        Monster monster2 = new Monster();
        addObject(monster2, 525, 451);
        Hippo hippo = new Hippo();
        addObject(hippo, 82, 387);
        monster.setLocation(318, 207);
        monster2.setLocation(253, 496);
        Banana banana = new Banana();
        addObject(banana, 179, 254);
        Banana banana2 = new Banana();
        addObject(banana2, 313, 307);
        Banana banana3 = new Banana();
        addObject(banana3, 658, 307);
        Banana banana4 = new Banana();
        addObject(banana4, 621, 71);
        Banana banana5 = new Banana();
        addObject(banana5, 344, 97);
        Banana banana6 = new Banana();
        addObject(banana6, 426, 332);
        Banana banana7 = new Banana();
        addObject(banana7, 355, 401);
        Banana banana8 = new Banana();
        addObject(banana8, 240, 408);
        Banana banana9 = new Banana();
        addObject(banana9, 462, 136);
        Banana banana10 = new Banana();
        addObject(banana10, 569, 276);
        Banana banana11 = new Banana();
        addObject(banana11, 551, 438);
        Banana banana12 = new Banana();
        addObject(banana12, 405, 537);
        Banana banana13 = new Banana();
        addObject(banana13, 427, 516);
        Banana banana14 = new Banana();
        addObject(banana14, 580, 349);
        Banana banana15 = new Banana();
        addObject(banana15, 575, 234);
        Banana banana16 = new Banana();
        addObject(banana16, 620, 157);
        Banana banana17 = new Banana();
        addObject(banana17, 725, 314);
        Banana banana18 = new Banana();
        addObject(banana18, 637, 617);
        Banana banana19 = new Banana();
        addObject(banana19, 536, 523);
        Banana banana20 = new Banana();
        addObject(banana20, 505, 355);
        Banana banana21 = new Banana();
        addObject(banana21, 508, 235);
        Banana banana22 = new Banana();
        addObject(banana22, 793, 292);
        Banana banana23 = new Banana();
        addObject(banana23, 707, 401);
        Banana banana24 = new Banana();
        addObject(banana24, 587, 520);
        Banana banana25 = new Banana();
        addObject(banana25, 457, 326);
        Banana banana26 = new Banana();
        addObject(banana26, 409, 227);
        Banana banana27 = new Banana();
        addObject(banana27, 286, 111);
        Banana banana28 = new Banana();
        addObject(banana28, 151, 119);
        Banana banana29 = new Banana();
        addObject(banana29, 222, 298);
        Banana banana30 = new Banana();
        addObject(banana30, 326, 371);
        Banana banana31 = new Banana();
        addObject(banana31, 251, 341);
        Banana banana32 = new Banana();
        addObject(banana32, 226, 138);
        Banana banana33 = new Banana();
        addObject(banana33, 298, 90);
        Banana banana34 = new Banana();
        addObject(banana34, 513, 183);
        Banana banana35 = new Banana();
        addObject(banana35, 579, 385);
        Banana banana36 = new Banana();
        addObject(banana36, 481, 497);
        Banana banana37 = new Banana();
        addObject(banana37, 317, 537);
        Banana banana38 = new Banana();
        addObject(banana38, 163, 540);
        Banana banana39 = new Banana();
        addObject(banana39, 31, 482);
        Banana banana40 = new Banana();
        addObject(banana40, 70, 354);
        Banana banana41 = new Banana();
        addObject(banana41, 171, 239);
        Banana banana42 = new Banana();
        addObject(banana42, 273, 209);
        Banana banana43 = new Banana();
        addObject(banana43, 435, 270);
        Banana banana44 = new Banana();
        addObject(banana44, 543, 481);
        Banana banana45 = new Banana();
        addObject(banana45, 65, 215);
        Banana banana46 = new Banana();
        addObject(banana46, 56, 197);
        Banana banana47 = new Banana();
        addObject(banana47, 45, 273);
        Banana banana48 = new Banana();
        addObject(banana48, 63, 421);
        Banana banana49 = new Banana();
        addObject(banana49, 369, 260);
        banana49.setLocation(373, 277);
        banana49.setLocation(389, 318);
        banana49.setLocation(403, 359);
        banana49.setLocation(469, 374);
        Banana banana50 = new Banana();
        addObject(banana50, 556, 358);
        Banana banana51 = new Banana();
        addObject(banana51, 663, 382);
        Banana banana52 = new Banana();
        addObject(banana52, 642, 437);
        Banana banana53 = new Banana();
        addObject(banana53, 502, 504);
        Banana banana54 = new Banana();
        addObject(banana54, 287, 413);
        Banana banana55 = new Banana();
        addObject(banana55, 344, 278);
        Banana banana56 = new Banana();
        addObject(banana56, 474, 188);
        Banana banana57 = new Banana();
        addObject(banana57, 586, 185);
        Banana banana58 = new Banana();
        addObject(banana58, 666, 255);
        Banana banana59 = new Banana();
        addObject(banana59, 710, 391);
        Banana banana60 = new Banana();
        addObject(banana60, 670, 505);
        Banana banana61 = new Banana();
        addObject(banana61, 741, 458);
        Banana banana62 = new Banana();
        addObject(banana62, 749, 136);
        Banana banana63 = new Banana();
        addObject(banana63, 782, 107);
        Banana banana64 = new Banana();
        addObject(banana64, 818, 318);
        Banana banana65 = new Banana();
        addObject(banana65, 780, 427);
        Banana banana66 = new Banana();
        addObject(banana66, 757, 404);
        Banana banana67 = new Banana();
        addObject(banana67, 637, 229);
        Banana banana68 = new Banana();
        addObject(banana68, 560, 219);
        Banana banana69 = new Banana();
        addObject(banana69, 550, 351);
        Banana banana70 = new Banana();
        addObject(banana70, 628, 517);
        Banana banana71 = new Banana();
        addObject(banana71, 666, 436);
        Banana banana72 = new Banana();
        addObject(banana72, 695, 159);
        Banana banana73 = new Banana();
        addObject(banana73, 711, 107);
        Banana banana74 = new Banana();
        addObject(banana74, 826, 310);
        Banana banana75 = new Banana();
        addObject(banana75, 842, 437);
        Banana banana76 = new Banana();
        addObject(banana76, 808, 303);
        Banana banana77 = new Banana();
        addObject(banana77, 684, 218);
        Banana banana78 = new Banana();
        addObject(banana78, 706, 373);
        Banana banana79 = new Banana();
        addObject(banana79, 801, 249);
        Banana banana80 = new Banana();
        addObject(banana80, 778, 196);
        Banana banana81 = new Banana();
        addObject(banana81, 723, 327);
        Banana banana82 = new Banana();
        addObject(banana82, 709, 361);
        Banana banana83 = new Banana();
        addObject(banana83, 571, 381);
        Banana banana84 = new Banana();
        addObject(banana84, 371, 360);
        Banana banana85 = new Banana();
        addObject(banana85, 535, 458);
        Banana banana86 = new Banana();
        addObject(banana86, 606, 336);
        Banana banana87 = new Banana();
        addObject(banana87, 514, 302);
        Banana banana88 = new Banana();
        addObject(banana88, 525, 371);
        Banana banana89 = new Banana();
        addObject(banana89, 507, 319);
        Banana banana90 = new Banana();
        addObject(banana90, 462, 438);
        Banana banana91 = new Banana();
        addObject(banana91, 473, 328);
        Banana banana92 = new Banana();
        addObject(banana92, 476, 462);
        Banana banana93 = new Banana();
        addObject(banana93, 502, 378);
        Banana banana94 = new Banana();
        addObject(banana94, 452, 430);
        Banana banana95 = new Banana();
        addObject(banana95, 474, 328);
        Banana banana96 = new Banana();
        addObject(banana96, 353, 466);
        Banana banana97 = new Banana();
        addObject(banana97, 444, 427);
        Banana banana98 = new Banana();
        addObject(banana98, 444, 427);
        Banana banana99 = new Banana();
        addObject(banana99, 520, 397);
        Banana banana100 = new Banana();
        addObject(banana100, 525, 402);
        Banana banana101 = new Banana();
        addObject(banana101, 486, 432);
        Banana banana102 = new Banana();
        addObject(banana102, 395, 413);
        Banana banana103 = new Banana();
        addObject(banana103, 515, 440);
        Banana banana104 = new Banana();
        addObject(banana104, 374, 432);
        Banana banana105 = new Banana();
        addObject(banana105, 402, 422);
        Banana banana106 = new Banana();
        addObject(banana106, 478, 389);
        Banana banana107 = new Banana();
        addObject(banana107, 447, 429);
        Banana banana108 = new Banana();
        addObject(banana108, 446, 430);
        Banana banana109 = new Banana();
        addObject(banana109, 446, 430);
        Banana banana110 = new Banana();
        addObject(banana110, 446, 430);
        Banana banana111 = new Banana();
        addObject(banana111, 446, 430);
        Banana banana112 = new Banana();
        addObject(banana112, 435, 502);
        Banana banana113 = new Banana();
        addObject(banana113, 406, 503);
        Banana banana114 = new Banana();
        addObject(banana114, 487, 447);
        Banana banana115 = new Banana();
        addObject(banana115, 415, 475);
        Banana banana116 = new Banana();
        addObject(banana116, 415, 475);
        Banana banana117 = new Banana();
        addObject(banana117, 415, 475);
        Banana banana118 = new Banana();
        addObject(banana118, 391, 524);
        Banana banana119 = new Banana();
        addObject(banana119, 372, 512);
        banana40.setLocation(153, 323);
        banana48.setLocation(170, 435);
        Poison poison = new Poison();
        addObject(poison, 430, 60);
        Poison poison2 = new Poison();
        addObject(poison2, 744, 316);
        Poison poison3 = new Poison();
        addObject(poison3, 359, 399);
        Poison poison4 = new Poison();
        addObject(poison4, 762, 529);
        Poison poison5 = new Poison();
        addObject(poison5, 194, 263);
    }
}