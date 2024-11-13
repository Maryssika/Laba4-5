# Описание:

Программа позволяет просмотр слайдшоу картинок из выбранной папки, а также содержит индикатор, отображающий на какой картинке вы сейчас находитесь.

# Установка и запуск:

Клонирование репозитория:

 https://github.com/Maryssika/Laba4-5.git

# Основные компоненты:

- Интерфейс Builder - Объявляет шаги конструирования продуктов, общие для всех видов строителей.

- ConcreteBuilder - Реализует шаги конструирования, каждый по-своему. Конкретные строители могут производить объекты разного представления.

- Product — создаваемый объект.

- Director - определяет порядок вызова строительных шагов для построения той или иной конфигурации продуктов.

- Client - контекст использования паттерна.
