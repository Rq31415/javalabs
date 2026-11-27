package edu.course.lab02;

public class ProjectTask {
    private final String id;
    private final String title;
    private TaskStatus status;
    private int estimatedHours;

    public ProjectTask(String id, String title, TaskStatus status, int estimatedHours) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID задачи не может быть пустым");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название задачи не может быть пустым");
        }
        if (status == null) {
            throw new IllegalArgumentException("Статус не может быть null");
        }
        if (estimatedHours <= 0) {
            throw new IllegalArgumentException("Оценка трудоемкости должна быть положительной");
        }
        this.id = id;
        this.title = title;
        this.status = status;
        this.estimatedHours = estimatedHours;
    }

    public void changeStatus(TaskStatus newStatus) {
        if (newStatus == null) {
            throw new IllegalArgumentException("Новый статус не может быть null");
        }
        this.status = newStatus;
    }

    public boolean isCompleted() {
        return this.status == TaskStatus.DONE;
    }

    public void addEstimatedHours(int additionalHours) {
        if (additionalHours <= 0) {
            throw new IllegalArgumentException("Добавляемые часы должны быть положительными");
        }
        this.estimatedHours += additionalHours;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }
}
