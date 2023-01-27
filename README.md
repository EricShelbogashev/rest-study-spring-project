# rest-study-spring-project

## TODO
- Создать Entity ToDo с полями и типами: id (строковое значение), description (строковое значение), completed (булево значение), created (дата и время), modified (дата и время).

- Создать REST API, обеспечивающий основные действия CRUD (создание, чтение, обновление, удаление). Использовать самые распространенные методы HTTP:  post, put, patch, get, delete.

- Создать репозиторий для хранения списка из нескольких запланированных дел (ToDo). Достаточно будет репозитория, размещаемого в оперативной памяти.

- Добавить обработчик ошибок на случай испорченного запроса или отсутствия у отправляемого нового ToDo всех требуемых полей. Единственное обязательное поле - description.

- Все запросы и ответы должны быть в формате JSON.