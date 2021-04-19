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

        boolean result;
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if (barriers[j] instanceof RunnigTrack)
                {
                    members[i].run();
                    result = barriers[j].overcome(members[i].getMaxDistance());
                }
                else
                {
                    members[i].jump();
                    result = barriers[j].overcome(members[i].getMaxHeight());
                }

                if (result == false)
                    break;

            }

        }
     }
}
