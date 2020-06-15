package fast.coding.challenge.c2.extract.method;

import java.util.List;

public class Challenge {
    //方法printOwing分为三部分，请将三部分分别提取成为三个子方法
    void printOwing(List<OrderItem> items) {
        //打印头部
        System.out.println("欢迎光顾超快编码超市");
        System.out.println("#################################");

        //打印购物项目
        for (OrderItem item : items) {
            System.out.println("名称: " + item.getName());
            System.out.println("数量: " + item.getAmount());
            System.out.println("价格: " + item.getPrice());
        }

        //打印小票尾部
        System.out.println("总价：" + getTotal(items));
        System.out.println("#################################");
    }

    private double getTotal(List<OrderItem> items) {
        return items.stream().mapToDouble(item -> item.getAmount() * item.getPrice()).sum();
    }

    private class OrderItem {
        private double amount;
        private String name;
        private double price;

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
