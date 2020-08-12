package com.kuang.blog.service.impl;

import com.kuang.blog.entity.Student;
import com.kuang.blog.mapper.StudentMapper;
import com.kuang.blog.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 狂神说
 * @since 2020-08-12
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
