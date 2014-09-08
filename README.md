Gradle and JUnit categories
====

JUnit 4.8 added experimental support for grouping tests using [categories](https://github.com/junit-team/junit/wiki/Categories) and Gradle has support for including/excluding categories as part of the DSL for configuring testing. This is an example of using the functionality.

There are several possible targets:

- `gradle test`: run all tests
- `gradle runSlow`: run only tests annotated with `SlowTest.class` as the category
- `gradle runFast`: run only tests annotated with `FastTest.class` as the category
- `gradle runCategories -Pcategories=<categoryList>`: run tests annotated with one or more categories (comma-separated). The category name needs to be the canonical class name; for this example you can specify `SlowTest` or `FastTest` because they live in the default package

