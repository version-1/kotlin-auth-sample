package kintai.model

/**
 * Created by version1 on 2017/02/11.
 */

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table





/**
 * userテーブルのEntity.
 * @param id 主キー
 * @param name 名前
 * @param age 年齢
 * @param sex 性別 ( 0・・・ 女  1・・・男)
 */
@Entity
@Table(name = "users")
data class User (
                @Id @GeneratedValue var id: Int? = 0,
                @Column(nullable = false) var name: String = "",
                @Column(nullable = false) var email: String = "",
                @Column(nullable = false) var encrypted_password: String = "",
                @Column var age: Int? = 0,
                @Column(nullable = false) var sex: Int = 0)

