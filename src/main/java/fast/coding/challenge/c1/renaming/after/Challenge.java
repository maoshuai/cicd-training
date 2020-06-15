package fast.coding.challenge.c1.renaming.after;
public class Challenge {
    void someMethod() {
        Customer customer = findCastumerById("1902929029");
        customer.purchaseVipMemberShipForGame("王者荣耀");
        customer.purchaseVipMemberShipForGame("魔兽世界");
        customer.purchaseVipMemberShipForGame("塞尔达，旷野气息");
        customer.purchaseVipMemberShipForGame("我的世界");
        customer.purchaseVipMemberShipForGame("分手厨房");
        customer.purchaseVipMemberShipForGame("疯狂马里奥");
        customer.purchaseVipMemberShipForGame("巫师猎人3");
    }

    private Customer findCastumerById(String id) {
        return new Customer();
    }

    public static class Customer {
        public void purchaseVipMemberShipForGame(String gameName) {

        }
    }
}
