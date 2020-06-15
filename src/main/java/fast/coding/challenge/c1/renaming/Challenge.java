package fast.coding.challenge.c1.renaming;
//下列代码有两个拼写错误：
//Castumer应该是Customer
//VioMemberShip应该是VipMemberShip
//请将相关的变量，类名，方法名拼写错误修复
public class Challenge {
    void someMethod() {
        Castumer castumer = findCastumerById("1902929029");
        castumer.purchaseVioMemberShipForGame("王者荣耀");
        castumer.purchaseVioMemberShipForGame("魔兽世界");
        castumer.purchaseVioMemberShipForGame("塞尔达，旷野气息");
        castumer.purchaseVioMemberShipForGame("我的世界");
        castumer.purchaseVioMemberShipForGame("分手厨房");
        castumer.purchaseVioMemberShipForGame("疯狂马里奥");
        castumer.purchaseVioMemberShipForGame("巫师猎人3");
    }

    private Castumer findCastumerById(String id) {
        return new Castumer();
    }

    public static class Castumer {
        public void purchaseVioMemberShipForGame(String gameName) {

        }
    }
}
