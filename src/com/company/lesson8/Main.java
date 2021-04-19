package com.company.lesson8;

public class Main {

    public static void main(String[] args)
    {
        Member[] members = new Member[3];
        members[0] = new Cat(34, 2);
        members[1] = new Man(120, 3);
        members[2] = new Robot(230, 6);

        Barrier[] barriers = new Barrier[3];
        barriers[0] = new RunnigTrack(21);
        barriers[1] = new Wall(3);
        barriers[2] = new RunnigTrack(200);

        for (int i = 0; i < barriers.length; i++) {
            for (int j = 0; j < members.length; j++) {
                if (barriers[i] instanceof RunnigTrack)
                {
                    members[j].run(barriers[i].getDistance());
                    barriers[i].overcome(members[j].getMaxDistance());
                }
                else
                {
                    members[j].jump(barriers[i].getDistance());
                    barriers[i].overcome(members[j].getMaxHeight());
                }

            }

        }
     }
}
