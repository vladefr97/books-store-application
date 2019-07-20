package com.vladefr97;

import com.vladefr97.models.Book;
import com.vladefr97.models.User;
import com.vladefr97.services.BookService;
import com.vladefr97.services.UserService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        BookService bookService = new BookService();

//
//        List<Book> bookList = new ArrayList<>();
//        bookList.add(new Book())

        //  TODO:  добавить хэширование паролей
//        List<User> userList = new ArrayList<>();
//        userList.add(new User("Петров Петр Петрович","petr.petrov","petr-pass"));
//        userList.add(new User("Десятков Владлен Платонович ","desiat.vlad","desiat-pass"));
//        userList.add(new User("Бескрёстнова Рената Анатолиевна","beskrest.renata","beskrest-pass"));
//        userList.add(new User("Осинова Фаина Александровна","osin.faina","osin-pass"));
//        userList.add(new User("Золотов Павел Захарович","zolot.pavel","zolot-pass"));
//        userList.add(new User("Мандрыкин Лукьян Леонович","mandir.luk","mandir-pass"));
//        userList.add(new User("Корнилов Евдоким Михеевич","kornil.evdok","kornil-pass"));
//        userList.add(new User("Берестова Валентина Александровна","berest.val","berest-pass"));
//        userList.add(new User("Асланов Святослав Владиславович","aslan.sviat","aslan-pass"));
//        userList.add(new User("Кузькин Тимофей Саввевич","kuzkin.tim","kuzkin-pass"));
//        for(User user: userList){
//            userService.saveUser(user);
//        }


        List<Book> bookList = new ArrayList<>();
        List<User> userList = userService.findAllUsers();
        Random random = new Random();
//        bookList.add(new Book("«Властелин колец» — Джон Р. Р. Толкин", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Гордость и предубеждение» — Джейн Остин", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Тёмные начала» — Филип Пулман", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Автостопом по галактике» ", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Гарри Поттер и Кубок огня» — Джоан Роулинг", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Убить пересмешника» — Харпер Ли", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Винни Пух» — Алан Александр Милн", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«1984» — Джордж Оруэлл", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Лев, колдунья и платяной шкаф» — Клайв Стэйплз Льюис", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Джейн Эйр» — Шарлотта Бронте", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Уловка-22» — Джозеф Хеллер", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Ветер в ивах» — Кеннет Грэм", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Большие надежды» — Чарльз Диккенс", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Маленькие женщины» — Луиза Мэй Олкотт", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Война и мир» — Лев Толстой", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Унесённые ветром» — Маргарет Митчелл", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Хоббит, или Туда и обратно» — Джон Р. Р. Толкин", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Столпы Земли» — Кен Фоллетт", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Остров сокровищ» — Роберт Стивенсон", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Дюна» — Фрэнк Герберт", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Аня из Зеленых Мезонинов» — Люси Мод Монтгомери", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Скотный двор» — Джордж Оруэлл", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Артемис Фаул» — Йон Колфер", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Мемуары гейши» — Артур Голден", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//
//        bookList.add(new Book("«Поющие в терновнике» — Колин Маккалоу", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//
//        bookList.add(new Book("«Волхв» — Джон Фаулз", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Благие знамения» — Терри Пратчетт и Нил Гейман", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Стража! Стража!» — Терри Пратчетт", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Дневник Бриджит Джонс» — Хелен Филдинг", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Улисс» — Джеймс Джойс", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«О дивный новый мир» — Олдос Хаксли", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«В дороге» — Джек Керуак", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Алхимик» — Пауло Коэльо", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Любовь во время холеры» — Габриэль Гарсиа Маркес\n", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Пляж» — Алекс Гарленд", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Дракула» — Брэм Стокер", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«День Шакала» — Фредерик Форсайт", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Сёгун» — Джеймс Клавелл", getRandomDatetime(),
//                userList.get(random.nextInt(userList.size()))));
//        bookList.add(new Book("«Сага о Форсайтах» — Джон Голсуорси", getRandomDatetime(),
////                userList.get(random.nextInt(userList.size()))));
//        List<Book> userBooks = bookService.findAllBooks();
//        for(Book book: userBooks)
//            System.out.println(book.getTitle());

      //  List<Book> foundBooks = bookService.findByUserIdWithDates()
//
//        System.out.println(userService.findBooksById(
//                userList.get(11).getId()));
    }

    private static String getRandomDatetime() {
        Random random = new Random();
        int daysAgo = random.nextInt(100);
        int hoursAgo = random.nextInt(25);
        int minutesAgo = random.nextInt(61);
        Date now = new Date();
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date(
                now.getTime() - (daysAgo * hoursAgo * minutesAgo * 60 * 1000)));


    }


}
