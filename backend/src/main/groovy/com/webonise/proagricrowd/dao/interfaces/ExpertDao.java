package com.webonise.proagricrowd.dao.interfaces;


import com.webonise.proagricrowd.sql.tables.pojos.Individuals;

import java.util.List;

public interface ExpertDao {
    List<Individuals> getAllExpertDetails();
}
