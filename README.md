# TechnoStudy Automation Project

This project is designed for participants to test and enhance their skills by automating various test cases on the TechnoStudy website.

## Table of Contents
1. [Project Overview](#project-overview)
2. [Technologies Used](#technologies-used)
3. [Project Requirements](#project-requirements)
4. [User Stories](#user-stories)
5. [Contributors](#contributors)
6. [License](#license)

## Project Overview
This project was designed for participants to test their own skills. It was created based on various functions and test scenarios on the Techno Study platform.

## Technologies Used
- **Java** - Programming language
- **Selenium** - Web browser automation
- **TestNG** - Testing framework
- **Apache POI** - Library for reading and writing Excel files
- **Git & GitHub** - Version control systems
- **JIRA & Zephyr-Squad** - Test management tools
- **Page Object Model (POM)** - Test automation pattern
- **Safari, Firefox, Google Chrome** - Web browsers used in testing

## Project Requirements
1. **Page Object Model (POM)**: The POM design pattern is used for structuring the test cases.

2. **Parallel Testing**: Tests are executed in parallel on Chrome and Firefox browsers.

3. **XML Configuration**: Test cases are executed from an XML file.

4. **Smoke and Regression Testing**: Separate XML files are created for smoke and regression testing.

5. **Live Environment Considerations**: To keep the environment clean after testing, "test" is included in the name and email fields, and the country is set to "Argentina".

## User Stories
1. A dropdown menu titled "Kurslar" or "Courses" should be visible at the top of the homepage.
2. Upon clicking the dropdown menu, a list of all available courses should open.
3. Each course name should be visible.
4. Clicking on a course should direct the user to the respective course page.
5. The dropdown menu should improve user experience by providing quicker access to courses.

### Test Case 2: Cross Campus
1. The homepage should have a "Campus Girişi" or "Log in to Campus" option at the top.
2. Clicking on this option should navigate to the Campus login page.
3. There is no need to log in (for security reasons).

### Test Case 3: Booking
1. The homepage should have a visible "Başvur" or "Apply" button.
2. Clicking on the button should take the user to an application form page.
3. The form should be easy to fill, requiring fields like name, surname, contact info, and desired course.
4. Test data should be used to keep the environment clean (e.g., "Test Ali Karaca" or "test_a.karaca@gmail.com") and Andorra should be selected as the country.
5. After submitting the form, a confirmation message should appear.

### Test Case 4: Submenu Courses
1. The website's top or side menu should have a "Kurslar" or "Courses" option.
2. Clicking on this option should display a list or submenu of all available courses.
3. Each course name and a brief description should be visible.
4. Clicking on a course should direct the user to the respective course page.
5. This feature improves user accessibility to course content.

### Test Case 5: Submenu Social Media
1. The website's footer menu should have an area for "Sosyal Medya" or social media accounts.
2. Each social media account name or icon should be visible.
3. Clicking on a social media account should open the corresponding profile or page.

### Test Case 6: Logo To Homepage
1. The Techno Study logo should be present in the header of every page.
2. Clicking the logo should navigate back to the homepage.

### Test Case 7: Course Details
1. In the "Kendi Kursunu Seç" section, each course should have a "Detaylı Bilgi" or "More Info" button or link.
2. Clicking this button should navigate to the detailed course information page.
3. The Techno Study logo should be visible on the course detail page.

### Test Case 8: Terms Of Use
1. The "Bize Ulaşın" form should have a "Şartları okudum ve kabul ettim" checkbox.
2. Clicking on this checkbox should lead to the "Terms of Use" page.
3. The page should be properly formatted for users to easily read and understand the terms.

## Contributors

| Role            | Name               |
|-----------------|--------------------|
|QA Automation Engineer & Project Lead    | [Fatmanur CEYLAN](https://github.com/fceylans)  |
| QA Automation Engineer          | [Buse OZER](https://github.com/acklnbuse)                      |
| QA Automation Engineer          | [Mazlum OZDEMIR](https://github.com/mazlumoz)   |
| QA Automation Engineer          | [Mehmet Emin VAHAP](https://github.com/mmevaa)   |
| QA Automation Engineer          | [Omer Faruk OZ](https://github.com/omerfoz)   |

## License
This project is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).


