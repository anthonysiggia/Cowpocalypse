import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class forrest1 here.
 * @author (your name) @version (a version number or a date)
 */
public class forrest1 extends levels
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private long lastFrameTimeMS;
    private double timeStepDuration;

    /**
     * 
     */
    public forrest1()
    {
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60;

        prepare();
    }

    /**
     * 
     */
    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    /**
     * 
     */
    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    /**
     * 
     */
    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        cow cow = new cow();
        addObject(cow,101,369);
        alien1 alien1 = new alien1();
        addObject(alien1,737,108);
        alien1.setLocation(767,106);
        alien1 alien12 = new alien1();
        addObject(alien12,767,106);
        alien12.setLocation(797,102);
        alien1 alien13 = new alien1();
        addObject(alien13,797,102);
        alien13.setLocation(823,102);
        alien1 alien14 = new alien1();
        addObject(alien14,823,102);
        alien14.setLocation(846,103);
        alien1 alien15 = new alien1();
        addObject(alien15,846,103);
        alien1 alien16 = new alien1();
        addObject(alien16,735,199);
        alien16.setLocation(765,199);
        alien1 alien17 = new alien1();
        addObject(alien17,765,199);
        alien17.setLocation(785,209);
        alien1 alien18 = new alien1();
        addObject(alien18,785,209);
        alien18.setLocation(822,210);
        alien1 alien19 = new alien1();
        addObject(alien19,822,210);
        alien19.setLocation(848,209);
        alien1 alien110 = new alien1();
        addObject(alien110,848,209);
        alien17.setLocation(793,211);
        alien1 alien111 = new alien1();
        addObject(alien111,793,211);
        alien1 alien112 = new alien1();
        addObject(alien112,735,292);
        alien112.setLocation(713,103);
        alien16.setLocation(708,196);
        alien1 alien113 = new alien1();
        addObject(alien113,708,196);
        alien16.setLocation(752,204);
        alien1 alien114 = new alien1();
        addObject(alien114,752,204);
        alien1.setLocation(782,127);
        alien1 alien115 = new alien1();
        addObject(alien115,782,127);
        alien1.setLocation(729,134);
        alien1 alien116 = new alien1();
        addObject(alien116,729,134);
        alien1.setLocation(776,143);
        alien1 alien117 = new alien1();
        addObject(alien117,776,143);
        alien12.setLocation(799,171);
        alien1 alien118 = new alien1();
        addObject(alien118,799,171);
        alien16.setLocation(759,190);
        alien1 alien119 = new alien1();
        addObject(alien119,759,190);
        alien1 alien120 = new alien1();
        addObject(alien120,795,171);
        alien12.setLocation(802,154);
        alien1 alien121 = new alien1();
        addObject(alien121,802,154);
        alien12.setLocation(794,170);
        alien1 alien122 = new alien1();
        addObject(alien122,794,170);
        alien1.setLocation(749,141);
        alien1 alien123 = new alien1();
        addObject(alien123,749,141);
        alien13.setLocation(820,159);
        alien1 alien124 = new alien1();
        addObject(alien124,820,159);
        alien1.setLocation(769,160);
        alien1 alien125 = new alien1();
        addObject(alien125,769,160);
        alien12.setLocation(797,147);
        alien1 alien126 = new alien1();
        addObject(alien126,797,147);
        alien1 alien127 = new alien1();
        addObject(alien127,762,149);
        alien13.setLocation(815,171);
        alien1 alien128 = new alien1();
        addObject(alien128,815,171);
        alien1.setLocation(776,160);
        alien1 alien129 = new alien1();
        addObject(alien129,776,160);
        alien12.setLocation(799,171);
        alien1 alien130 = new alien1();
        addObject(alien130,799,171);
        alien1 alien131 = new alien1();
        addObject(alien131,734,140);
        alien1.setLocation(774,175);
        alien1 alien132 = new alien1();
        addObject(alien132,774,175);
        alien1 alien133 = new alien1();
        addObject(alien133,792,165);
        alien13.setLocation(825,168);
        alien1 alien134 = new alien1();
        addObject(alien134,825,168);
        alien1.setLocation(768,158);
        alien1 alien135 = new alien1();
        addObject(alien135,768,158);
        alien1 alien136 = new alien1();
        addObject(alien136,747,154);
        alien1 alien137 = new alien1();
        addObject(alien137,785,175);
        alien12.setLocation(788,165);
        alien1 alien138 = new alien1();
        addObject(alien138,788,165);
        alien13.setLocation(818,163);
        alien1 alien139 = new alien1();
        addObject(alien139,818,163);
        alien1.setLocation(758,175);
        alien1 alien140 = new alien1();
        addObject(alien140,758,175);
        alien12.setLocation(794,163);
        alien1 alien141 = new alien1();
        addObject(alien141,794,163);
        alien1 alien142 = new alien1();
        addObject(alien142,809,185);
        alien16.setLocation(752,182);
        alien1 alien143 = new alien1();
        addObject(alien143,752,182);
        alien18.setLocation(825,184);
        alien1 alien144 = new alien1();
        addObject(alien144,825,184);
        j j = new j();
        addObject(j,866,324);
        alien1 alien145 = new alien1();
        addObject(alien145,768,194);
        alien1 alien146 = new alien1();
        addObject(alien146,501,114);
        alien146.setLocation(518,115);
        alien1 alien147 = new alien1();
        addObject(alien147,518,115);
        alien146.setLocation(533,119);
        alien1 alien148 = new alien1();
        addObject(alien148,533,119);
        alien146.setLocation(547,118);
        alien1 alien149 = new alien1();
        addObject(alien149,547,118);
        alien147.setLocation(552,120);
        alien1 alien150 = new alien1();
        addObject(alien150,552,120);
        alien146.setLocation(504,107);
        alien1 alien151 = new alien1();
        addObject(alien151,504,107);
        alien146.setLocation(525,114);
        alien1 alien152 = new alien1();
        addObject(alien152,525,114);
        alien146.setLocation(540,109);
        alien1 alien153 = new alien1();
        addObject(alien153,540,109);
        alien147.setLocation(551,110);
        alien1 alien154 = new alien1();
        addObject(alien154,551,110);
        alien146.setLocation(534,104);
        alien1 alien155 = new alien1();
        addObject(alien155,534,104);
        alien146.setLocation(511,107);
        alien1 alien156 = new alien1();
        addObject(alien156,511,107);
        alien146.setLocation(538,121);
        alien1 alien157 = new alien1();
        addObject(alien157,538,121);
        alien146.setLocation(529,118);
        alien1 alien158 = new alien1();
        addObject(alien158,529,118);
        alien146.setLocation(537,119);
        alien1 alien159 = new alien1();
        addObject(alien159,537,119);
        alien12.setLocation(821,214);
        alien1 alien160 = new alien1();
        addObject(alien160,507,121);
        alien146.setLocation(518,110);
        alien1 alien161 = new alien1();
        addObject(alien161,518,110);
        alien153.setLocation(566,35);
        alien146.setLocation(542,111);
        alien1 alien162 = new alien1();
        addObject(alien162,542,111);
        alien1 alien163 = new alien1();
        addObject(alien163,526,111);
        alien146.setLocation(528,108);
        alien1 alien164 = new alien1();
        addObject(alien164,528,108);
        alien1 alien165 = new alien1();
        addObject(alien165,518,114);
        alien1 alien166 = new alien1();
        addObject(alien166,542,107);
        alien146.setLocation(524,108);
        alien1 alien167 = new alien1();
        addObject(alien167,524,108);
        alien147.setLocation(549,114);
        alien1 alien168 = new alien1();
        addObject(alien168,549,114);
        alien146.setLocation(531,116);
        alien1 alien169 = new alien1();
        addObject(alien169,531,116);
        alien146.setLocation(521,121);
        alien1 alien170 = new alien1();
        alien146.setLocation(560,120);
        addObject(alien170,560,120);
        alien1 alien194 = new alien1();
        addObject(alien194,619,135);
        alien1 alien195 = new alien1();
        addObject(alien195,657,152);
        alien1 alien196 = new alien1();
        addObject(alien196,684,157);
        alien1 alien197 = new alien1();
        addObject(alien197,718,154);
        removeObject(cow);


        j.setLocation(872,313);

        GHGJ gHGJ = new GHGJ();
        addObject(gHGJ,100,305);
        cow cow2 = new cow();
        addObject(cow2,42,377);
    }
}
