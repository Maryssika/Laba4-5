# Описание:

Программа позволяет просмотр слайдшоу картинок из выбранной папки, а также содержит индикатор, отображающий на какой картинке вы сейчас находитесь.

# Установка и запуск:

Клонирование репозитория:

git clone Maryssika/Laba4-5

# Основные компоненты:

- Интерфейс Builder - Объявляет шаги конструирования продуктов, общие для всех видов строителей.

- ConcreteBuilder - Реализует шаги конструирования, каждый по-своему. Конкретные строители могут производить объекты разного представления.

- Product — создаваемый объект.

- Director - определяет порядок вызова строительных шагов для построения той или иной конфигурации продуктов.

- Client - контекст использования паттерна.

# Архитектура:

![laba5](https://github.com/user-attachments/assets/fe31c875-b084-4d8a-b6b3-22494252424e)
