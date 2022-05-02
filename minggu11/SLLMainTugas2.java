public class SLLMainTugas2 {
    public static void main(String[] args) {
        SingleLinkedListTugas2 singLL = new SingleLinkedListTugas2();
        
        singLL.addFirst('a');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
        singLL.inserAt(1, 'b');
        singLL.print();
        singLL.insertAfter('b', 'c');
        singLL.print();
        singLL.insertBefore('e', 'd');
        singLL.print();
    }
}
