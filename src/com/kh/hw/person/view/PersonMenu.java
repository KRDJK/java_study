package com.kh.hw.person.view;

import com.kh.hw.person.controller.PersonController;

import java.util.Scanner;

public class PersonMenu {
    private Scanner sc;
    private PersonController pc;


    // 생성자
    public PersonMenu() {
        sc = new Scanner(System.in);
        pc = new PersonController();

        this.mainMenu();
    }


    // 메서드
    public void mainMenu() {
        while (true) {
            System.out.printf("학생은 최대 %d명까지 저장할 수 있습니다.\n", pc.printStudent().length);
            System.out.printf("현재 저장된 학생은 %d명입니다.\n", pc.personCount()[0]);
            System.out.printf("사원은 최대 %d명까지 저장할 수 있습니다.\n", pc.printEmployee().length);
            System.out.printf("현재 저장된 사원은 %d명입니다.\n\n", pc.personCount()[1]);
            System.out.println("1. 학생 메뉴");
            System.out.println("2. 사원 메뉴");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    employeeMenu();
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }

        }
    } // end mainMenu


    // 1. 학생 메뉴 진입.
    public void studentMenu() {
        while (true) {
            if (pc.personCount()[0] == pc.printStudent().length) {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
            }
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 보기");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    if (pc.personCount()[0] == pc.printStudent().length) {
                        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                        break;
                    } else {
                        insertStudent();
                        break;
                    }
                case 2:
                    printStudent();
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }


    // 1-1. 학생 추가 메뉴.
    public void insertStudent() {
        while (true) {
            System.out.print("학생 이름 : ");
            String name = sc.next();

            System.out.print("학생 나이 : ");
            int age = sc.nextInt();
            sc.nextLine(); // \n먹기

            System.out.print("학생 키 : ");
            double height = sc.nextDouble();
            sc.nextLine(); // \n먹기

            System.out.print("학생 몸무게 : ");
            double weight = sc.nextDouble();
            sc.nextLine(); // \n먹기

            System.out.print("학생 학년 : ");
            int grade = sc.nextInt();
            sc.nextLine(); // \n먹기
            
            System.out.print("학생 전공 : ");
            String major = sc.nextLine();


            pc.insertStudent(name, age, height, weight, grade, major);

            if (pc.personCount()[0] == pc.printStudent().length) {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
                break;
            } else {
                System.out.print("\n그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
                String isEnd = sc.next();

                if (isEnd.equals("n") || isEnd.equals("N")) {
                    break;
                }
            }
        }
    } // end insertStudent


    // 1-2. 학생 보기 메뉴 진입
    public void printStudent() {
        if (pc.personCount()[0] == 0) {
            System.out.println("저장된 학생이 존재하지 않으므로 조회할 수 없습니다.");
            return;
        }
        for (int i = 0; i < pc.personCount()[0]; i++) {
            System.out.println(pc.printStudent()[i].toString());
        }
    }


    // 2. 사원 메뉴 진입
    public void employeeMenu() {
        while (true) {
            if (pc.personCount()[1] == pc.printEmployee().length) {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
            }
            System.out.println("1. 사원 추가");
            System.out.println("2. 사원 보기");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    if (pc.personCount()[1] == pc.printEmployee().length) {
                        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                        break;
                    } else {
                        insertEmployee();
                        break;
                    }
                case 2:
                    printEmployee();
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    } // end employeeMenu


    // 2-1 사원 추가 메뉴 진입
    public void insertEmployee(){
        while (true) {
            System.out.print("\n사원 이름 : ");
            String name = sc.next();

            System.out.print("\n사원 나이 : ");
            int age = sc.nextInt();
            sc.nextLine(); // \n먹기

            System.out.print("\n사원 키 : ");
            double height = sc.nextDouble();
            sc.nextLine(); // \n먹기

            System.out.print("\n사원 몸무게 : ");
            double weight = sc.nextDouble();
            sc.nextLine(); // \n먹기

            System.out.print("\n사원 급여 : ");
            int salary = sc.nextInt();
            sc.nextLine(); // \n먹기

            System.out.print("\n사원 부서 : ");
            String dept = sc.nextLine();


            pc.insertEmployee(name, age, height, weight, salary, dept);

            if (pc.personCount()[1] == pc.printEmployee().length) {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
                break;
            } else {
                System.out.print("\n그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
                String isEnd = sc.next();

                switch (isEnd) {
                    case "N": case "n":
                        break;
                    default:
                }
            }
        }
    } // end insertEmployee


    // 2-2번 사원 보기 메뉴 진입
    public void printEmployee() {
        if (pc.personCount()[1] == 0) {
            System.out.println("저장된 사원이 존재하지 않으므로 조회할 수 없습니다.");
            return;
        }
        for (int i = 0; i < pc.personCount()[1]; i++) {
            System.out.println(pc.printEmployee()[i].toString());
        }
    }

} // end class
