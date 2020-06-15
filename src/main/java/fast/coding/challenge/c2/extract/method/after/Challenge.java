package fast.coding.challenge.c2.extract.method.after;

import java.util.List;

public class Challenge {
    void printOwing(List<OrderItem> items) {
        printHead();
        printItems(items);
        printTail(items);
    }

    private void printTail(List<OrderItem> items) {
        System.out.println("总价：" + getTotal(items));
        System.out.println("#################################");
    }

    private void printItems(List<OrderItem> items) {
        for (OrderItem item : items) {
            System.out.println("名称: " + item.getName());
            System.out.println("数量: " + item.getAmount());
            System.out.println("价格: " + item.getPrice());
        }
    }

    private void printHead() {
        System.out.println("欢迎光顾超快编码超市");
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
