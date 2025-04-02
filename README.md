[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Uo_opV_n)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18970557)
# Task 3. Gradle broken build homework

In this task you need to fix this project:

1) Oh no, error `Configuration with name 'implementation' not found.` is thrown for all `build.gradle.kts` files. What is the mistake?
2) This project has 2 modules: `module1` and `module2`, but why doesn’t IntelliJ IDEA highlight `module1`?
3) `module2` contains the utils package with the `getStringRepresentation` function. We want to call this function from `module1`, but we get an error when we try. How would you fix this error?
4) It seems some imports are unresolved in [QuickSortTest.kt](./module1/src/test/kotlin/QuickSortTest.kt). What is the real reason?
5) `module1` contains an implementation of the `quickSort` algorithm. The current version has several mistakes (the right version is commented). If you try to run tests locally, they will fail, but CI says everything is ok, because `./gradlew test` does not fail. What is the reason? You need to change something in order for the task `./gradlew test` to run tests.
6) The project has a [libs.versions.toml](./gradle/libs.versions.toml) file to store versions, plugins, and dependencies. You need to move all dependencies from the `build.gradle.kts` file into this toml file.

**For the instructor, how to grade an assignment:**

Each fix earns 0.5 points. In total, a student can get 3 points for this homework.
