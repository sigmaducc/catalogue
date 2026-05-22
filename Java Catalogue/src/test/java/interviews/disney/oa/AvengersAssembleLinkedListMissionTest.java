package interviews.disney.oa;

import com.adnan.interviews.disney.oa.AvengersAssembleLinkedListMission;
import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AvengersAssembleLinkedListMissionTest {

    private final AvengersAssembleLinkedListMission avengersAssembleLinkedListMission = new AvengersAssembleLinkedListMission();

    @Test
    void test1() {
        int[] nums = {3,5,3,7,8};
        int[] output = {3,3,8,5,7};
        ListNode head = LinkedListUtils.construct(nums);

        ListNode result = avengersAssembleLinkedListMission.createLinkedList(head);

        assertArrayEquals(output, LinkedListUtils.toArray(result));
    }

    @Test
    void test2() {
        int[] nums = {1,2,3,4,5};
        int[] output = {1,3,5,2,4};
        ListNode head = LinkedListUtils.construct(nums);

        ListNode result = avengersAssembleLinkedListMission.createLinkedList(head);

        assertArrayEquals(output, LinkedListUtils.toArray(result));
    }

}