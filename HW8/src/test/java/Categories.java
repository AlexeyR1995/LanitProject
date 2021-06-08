public enum Categories {

    Транспорт("Транспорт", 2),
    Автомобили("Автомобили", 3),
    Мотоциклы_и_мототехника("Мотоциклы и мототехника", 4),
    Грузовики_и_спецтехника("Грузовики и спецтехника", 5),
    Водный_транспорт("Водный_транспорт", 6),
    Запчасти_и_аксессуары("Запчасти_и_аксессуары", 6),
    Недвижимость("Недвижимость", 8),
    Квартиры("Квартиры", 9),
    Комнаты("Комнаты", 10),
    Дома_дачи_коттеджи("Дома_дачи_коттеджи",11),
    Гаражи_и_машиноместа("Гаражи_и_машиноместа", 12),
    Земельные_участки("Земельные_участки", 13),
    Коммерческая_недвижимость("Коммерческая_недвижимость", 14),
    Недвижимость_за_рубежом("Недвижимость_за_рубежом", 15),
    Работа("Работа", 16),
    Вакансии("Вакансии", 17),
    Резюме("Резюме", 18),
    Услуги("Услуги", 19),
    Личные_вещи("Личные_вещи", 20),
    Одежда_обувь_аксессуары("Одежда_обувь_аксессуары", 21),
    Детская_одежда_и_обувь("Детская_одежда_и_обувь", 22),
    Товары_для_детей_и_игрушки("Товары_для_детей_и_игрушки", 23),
    Часы_и_украшения("Часы и украшения", 24),
    Красота_и_здоровье("Красота_и_здоровье", 25),
    Для_дома_и_дачи("Для_дома_и_дачи",26),
    Бытовая_техника("Бытовая_техника",27),
    Мебель_и_интерьер("Мебель_и_интерьер",28),
    Посуда_и_товары_для_кухни("Посуда_и_товары_для_кухни", 29),
    Продукты_питания("Продукты_питания",30),
    Ремонт_и_строительство("Ремонт_и_строительство",31),
    Растения("Растения", 32),
    Бытовая_электроника("Бытовая_электроника",33),
    Аудио_и_видео("Аудио_и_видео",34),
    Игры_приставки_и_программы("Игры_приставки_и_программы", 35),
    Настольные_компьютеры("Настольные_компьютеры", 36),
    Ноутбуки("Ноутбуки",37),
    Оргтехника_и_расходники("Оргтехника_и_расходники",38),
    Планшеты_и_электронные_книги("Планшеты_и_электронные_книги",39),
    Телефоны("Телефоны",40),
    Товары_для_компьютера("Товары_для_компьютера",41),
    Фототехника("Фототехника",42),
    Хобби_и_отдых("Хобби_и_отдых",43),
    Билеты_и_путешествия("Билеты_и_путешествия",44),
    Велосипеды("Велосипеды",45),
    Книги_и_журналы("Книги_и_журналы",46),
    Коллекционирование("Коллекционирование",47),
    Музыкальные_инструменты("Музыкальные_инструменты", 48),
    Охота_и_рыбалка("Охота_и_рыбалка",49),
    Спорт_и_отдых("Спорт_и_отдых", 50),
    Животные("Животные",51),
    Собаки("Собаки",52),
    Кошки("Кошки",53),
    Птицы("Птицы",54),
    Аквариум("Аквариум",55),
    Другие_животные("Другие_животные",56),
    Товары_для_животных("Товары_для_животных",57),
    Готовый_бизнес_и_оборудование("Готовый_бизнес_и_оборудование",58),
    Готовый_бизнес("Готовый_бизнес",59),
    Оборудование_для_бизнеса("Оборудование_для_бизнеса",60);

    public String type;
    public int id;

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    Categories(String type, int id) {
        this.type = type;
        this.id = id;
    }
}

