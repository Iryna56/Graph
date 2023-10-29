public class Main {
    public static void main(String[] args) {

        Node firstNode = new Node("Петя");
        Node secondNode = new Node("Вася");
        Node thirdNode = new Node("Коля");
        Node fourtNode = new Node("Антон");

        firstNode.add(secondNode);
        firstNode.add(thirdNode);

        secondNode.add(thirdNode);
        secondNode.add(fourtNode);

        thirdNode.add(firstNode);
        thirdNode.add(secondNode);

        Node result = firstNode.get("Вася");

        System.out.println(result);

       Node answer = result.get("Коля");
        System.out.println(answer);

        answer = answer.get("Вася");
        System.out.println(answer);

        firstNode.add(firstNode);

    }
}