package Data_Structure.queue;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * packageName    : Data_Structure.queue
 * fileName       : Q18258_2
 * author         : Hosun
 * date           : 2022-08-27
 * description    : Q18258 방법 중 다른 방법 (LinkedList , ArrayDeque)
                    ArrayList로도 가능하긴한데 , 런타임초과뜸
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-27        Hosun              최초 생성
 */

/*
    1. LinkedList 방식으로
    Deque<Integer> q = new LinkedList<>(); 선언 방식와
    LinkedList<Integer> q = new LinkedList<>(); 방식은 동일하다.
    ** LinkedList는 Deque(Queue를 상속받고 있음)도 구현하고 있기 때문에 **

    LinkedList<Integer> q = new LinkedList<>();
        q.offer();	// push
        q.pop();	// pop
        q.size();	// size
        q.isEmpty();	// empty
        q.peek();	// front
        q.peekLast();	// back

    2. ArrayDeque 방식으로
    Deque<Integer> q = new LinkedList<>();
    Deque<Integer> q = new ArrayDeque<>();

    메소드는 LinkedList와 동일하다!
 */

public class Q18258_2 {

}