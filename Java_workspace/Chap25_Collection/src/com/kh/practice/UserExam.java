package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		// HashMap ����
		//containsKey. containsValue
				Map<String, Integer> studentGrades = new HashMap<>();
				
				//�л��� ������ �߰��ϰڽ��ϴ�.
				studentGrades.put("KH", 95);
				studentGrades.put("Park", 80);
				studentGrades.put("David", 77);
				studentGrades.put("Bob", 92);
				
				//Ư�� �л��� ���� �˻�
				//Map containsKey : �ʿ��� key(Ű), value(��) �� �ִ��� Ȯ��
				String studentName = "ssss";
				//int studentScore = 1;
				//���࿡ �л��� �߿��� Bob �ִٸ� ������ ������
				if (studentGrades.containsKey(studentName)) {
					
					int grade = studentGrades.get(studentName);
					System.out.println(studentName + "�� ���� : " + grade);
				} else {
					System.out.println(studentName + " �� ������ ã�� �� �����ϴ�.");
				}
				
				
			}

		}
