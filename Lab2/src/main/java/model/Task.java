package model;

public class Task {
    public int taskId;
    public String difficulty;
    public int duration;
    public int volunteerId;
    public String taskDescription;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Task(int taskId, String difficulty, int duration, int volunteerId, String taskDescription) {
        this.taskId = taskId;
        this.difficulty = difficulty;
        this.duration = duration;
        this.volunteerId = volunteerId;
        this.taskDescription = taskDescription;
    }
}
