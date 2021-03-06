package stack;
import exceptions.*;
import lists.MyList;



public class Stack<T extends Comparable>{
    private MyList<T> list;

    public <E extends T>Stack(){
        list = (MyList<T>) new MyList<E>();
    }

    public T push(T item){
        list.add(item);
        return item;
    }

    public T pop() throws EmptyStackException, NoSuchMethodException {
        T value = (T) list.removeTAIL();
        if(value == null) throw new EmptyStackException(Stack.class.getMethod("pop"));
        return value;
    }

    public T peek() throws EmptyStackException, NoSuchMethodException {
        T value = (T) list.getTailValue();
        if(value == null) throw new EmptyStackException(Stack.class.getMethod("peek"));
        return value;
    }

    public boolean empty(){
        try{
            if(list.getTailValue() != null){
                return false;
            }
        } catch (NullPointerException exception){
            return true;
        }
        return true;
    }

    public int search(T o) throws EmptyStackException, NoSuchMethodException {
        if(getList().getHEAD().getValue() == null){
            System.out.println("-1");
            throw new EmptyStackException(Stack.class.getMethod("search", Comparable.class));
        }
        int counter = list.size();
        MyList.Node TEMP = getList().getHEAD();
        while (TEMP == getList().getTAIL() || hasNext(TEMP)){
            if(TEMP.getValue().equals(o)){
                return counter;
            } else {
                if(TEMP == getList().getTAIL()){
                    break;
                }
                TEMP = getList().moveToNext(TEMP);
                counter--;
            }
        }
        return -1;
    }

    private boolean hasNext(MyList.Node node){
        return node != getList().getTAIL();
    }

    public void clear(){
        list.removeDoublyLinkedList();
    }

    public MyList<T> getList() {
        return list;
    }
}
