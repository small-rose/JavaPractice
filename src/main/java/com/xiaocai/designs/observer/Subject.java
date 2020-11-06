package com.xiaocai.designs.observer;

/**
 * 主题，用来通知观察者的 被观察者接口，目标资源接口
 */
public interface Subject {

   public void registerObserver(MyObserver observer);
   public void removeObserver(MyObserver observer);

   public void notifyAllObservers();

}
