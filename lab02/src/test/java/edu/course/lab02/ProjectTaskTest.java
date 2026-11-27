package edu.course.lab02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProjectTaskTest {

    @Test
    void createsValidTaskAndUpdatesState() {
        ProjectTask task = new ProjectTask("T-1", "Реализовать API", TaskStatus.TODO, 5);
        assertFalse(task.isCompleted());

        task.changeStatus(TaskStatus.DONE);
        assertTrue(task.isCompleted());

        task.addEstimatedHours(3);
        assertEquals(8, task.getEstimatedHours());
    }

    @Test
    void throwsExceptionOnInvalidConstructorArguments() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("", "Title", TaskStatus.TODO, 5));
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("1", "   ", TaskStatus.TODO, 5));
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("1", "Title", null, 5));
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("1", "Title", TaskStatus.TODO, 0));
    }

    @Test
    void throwsExceptionOnInvalidBehaviorArguments() {
        ProjectTask task = new ProjectTask("T-1", "Тест", TaskStatus.IN_PROGRESS, 4);
        assertThrows(IllegalArgumentException.class, () -> task.changeStatus(null));
        assertThrows(IllegalArgumentException.class, () -> task.addEstimatedHours(-2));
    }
}
