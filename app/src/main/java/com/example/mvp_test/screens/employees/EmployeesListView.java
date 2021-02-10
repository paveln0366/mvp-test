package com.example.mvp_test.screens.employees;

import com.example.mvp_test.pojo.Employee;

import java.util.List;

public interface EmployeesListView {
    void showData(List<Employee> employees);
    void showError();
}
