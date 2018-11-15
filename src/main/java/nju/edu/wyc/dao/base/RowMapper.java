package nju.edu.wyc.dao.base;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper
 * @author wyc
 * @version v1.0
 */
public interface RowMapper
{
    public Object mapRow(ResultSet rs, int index)
        throws SQLException;
}
