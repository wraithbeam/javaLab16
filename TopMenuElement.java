import java.util.ArrayList;

import javax.swing.*;

public class TopMenuElement {
    JMenu mainMeJMenu;
    JMenu[] jMenus;
    JMenuItem[] items;

    public TopMenuElement(int jMenusElements, int itemElements){
     this.jMenus = new JMenu[jMenusElements];  
     this.items = new JMenuItem[itemElements]; 
    }

    public JMenu getjMenu() {
        return mainMeJMenu;
    }

    public int CreateMenuElement(String name,String[] menuName, String[] itemsName){

        if ((menuName.length != jMenus.length) || (itemsName.length != items.length)) //Если поля не заданы, прервыаем метод
            return 0;
        
        mainMeJMenu = new JMenu(name); //Создаем главную вкладку меню

        for(int i = 0; i < itemsName.length; i++){   //Создаем подэлементы меню
            items[i] = new JMenuItem(itemsName[i]);
        }

        //Если кол-во параметров меню = 0 следующий блок не сработает
        if(jMenus.length >= 1){
            for (int i = 0; i < jMenus.length; i++) { // Создаем параметры меню
                jMenus[i] = new JMenu(menuName[i]);
            }
            for (int i = 0; i < jMenus.length; i++) { // Добавляем подэлементы в парамерты меню
                for(int j = 0; j < items.length; j++){
                    jMenus[i].add(items[j]);
                }
            }
            for (JMenu jMenu : jMenus) { //Добавлем параметры меню в основное меню
                mainMeJMenu.add(jMenu);
            }
        }

        if(jMenus.length == 0){     //Если есть только один элемент меню, то добавляем в него действия
            for (JMenuItem jMenuItem : items) {
                mainMeJMenu.add(jMenuItem);
            }
        }
        return 1;
    }
}
