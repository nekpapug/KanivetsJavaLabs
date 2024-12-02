package laba4.controller;

import laba4.model.Group;
import laba4.model.Human;

public class GroupCreator {
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
}