package com.javaweb.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import com.javaweb.dao.SaldoDAO;
import com.javaweb.dao.utils.ConnectionFactory;

public class SaldoDAOImpl implements SaldoDAO {

  	public Double getSaldoConta(Long contaId) throws Exception {
		PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(
				"SELECT SUM(valor), conta_id FROM transacoes WHERE conta_id = ? AND data_transacao <= ? GROUP BY conta_id");
		stmt.setLong(1, contaId);
		stmt.setDate(2, new java.sql.Date(new Date().getTime()));
		ResultSet rs = stmt.executeQuery();
		if(!rs.next()) return null;
		Double saldo = rs.getDouble(1);
		rs.close();
		stmt.close();
		return saldo;
	}
}

